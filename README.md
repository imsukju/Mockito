# Mockito 프로젝트
[Mocito란?](https://view790.tistory.com/30) {pw:hellosj489} 


### 개요
이 프로젝트는 **Mockito**를 활용하여 유닛 테스트와 모의 객체(Mock Objects)를 실습한 프로젝트입니다.

---

## 프로젝트 구조
```
Mockito/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── mockitoone/
│   │   │   │   │   ├── dao/
│   │   │   │   │   │   ├── MyConfigs.java            # 데이터베이스 설정
│   │   │   │   │   │   ├── UserDao.java             # 사용자 DAO 인터페이스
│   │   │   │   │   │   ├── UserDaoJdbc.java         # JDBC 기반 DAO 구현
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├── UserService.java         # 사용자 서비스 인터페이스
│   │   │   │   │   │   ├── UserServiceImpl.java     # 사용자 서비스 구현
│   │   │   ├── mockitotwo/
│   │   │   │   ├── Hello.java                      # Hello 클래스
│   │   │   │   ├── HelloDependency.java            # 의존성 주입 클래스
│   │   ├── test/
│   │   │   ├── java/
│   │   │   │   ├── com/
│   │   │   │   │   ├── mockitotestone/
│   │   │   │   │   │   ├── mockito/
│   │   │   │   │   │   │   ├── Mymockito.java       # Mockito 테스트 예제
│   │   │   │   │   ├── Quiz0824test/
│   │   │   │   │   │   ├── One/Mocktest.java       # Quiz 테스트
└── pom.xml                                          # Maven 설정 파일
```

---

## 주요 기능

### 1. **Mock 객체를 사용한 단위 테스트**
- `UserServiceImpl`의 의존성을 `Mockito`를 사용하여 모의(Mock) 객체로 대체.
- 데이터 액세스 계층(DAO)의 동작을 시뮬레이션하여 빠른 테스트 환경 제공.

### 2. **테스트 대상**
- 사용자 서비스의 CRUD 연산 테스트.
- 특정 상황에서의 비즈니스 로직 검증.

---

## 실행 방법

1. **필수 요건**
   - Java 17 이상
   - Maven 설치

2. **빌드 및 테스트**
   - 터미널에서 프로젝트 디렉토리로 이동:
     ```bash
     cd Mockito
     ```
   - Maven 테스트 실행:
     ```bash
     mvn test
     ```
   - 테스트 결과 확인.