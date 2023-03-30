## SpringBoot Basic Auth Example 

- Java 11
- Spring boot 2.7.3
- H2 database
- Without WebSecurityConfigurerAdapter 
- Below is the curl command
- Check ImportUserData class for importing user
- Using Bean configuration in the WebSecurityConfig


- **Public endpoint**

```http
  curl --location --request GET 'http://localhost:8080/api/index'
```

- **User/Admin Role endpoint**

```http
  curl --location --request GET 'http://localhost:8080/api/admin' \
--header 'Authorization: Basic YWxpOnBhc3N3b3Jk'
```

- **Admin endpoint**

```http
  curl --location --request GET 'http://localhost:8080/api/user' \
--header 'Authorization: Basic YXdhaXM6cGFzc3dvcmQ='
```

- **Get User Authenticated Details endpoint**

```http
  curl --location --request GET 'http://localhost:8080/api/me' \
--header 'Authorization: Basic YXdhaXM6cGFzc3dvcmQ='
```
