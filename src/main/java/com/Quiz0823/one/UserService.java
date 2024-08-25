package com.Quiz0823.one;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;

import com.Quiz0823.one.domain.User;

public class UserService {
	 
	List<User> users ;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<User> userMapper = 
			new RowMapper<User>() {
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User user = new User();
						user.setId(rs.getLong("id"));
						user.setName(rs.getString("name"));
						user.setAge(rs.getInt("age"));
						return user;
				}
			};
	
	
	public User getUserById(Long id)
	{
		for(User user : users)
		{
			if (user.getId() == id)
			{
				return user;
			}
		}
		return null;
	}
	
	
	public Optional<User> get(Long id) {
		String sql = "select * from users where id = ?";	    		
	    
	    try (Stream<User> stream = jdbcTemplate.queryForStream(sql, this.userMapper, id)) {
	        return stream.findFirst();
	    } catch (DataAccessException e) {
	        return Optional.empty();
	    }
	}
}
