# SpringSecurity_Roles
Build simple project with descreptive notes within the code for spring security with: <br> java 17 <br> maven project <br>
Spring Boot 3.0.6

# Tools utilized:
<li>Spring Web</li>
<li>Spring Security</li>
<li>MySQL Driver </li>
<li>Lombok </li>

# Test Using Postman: 

### /api/v1/auth/authenticate
```
{
    "email": "hanan@example.com",
    "password":"123"
}
```
### /api/v1/auth/register
```
{
    "firstName": "Hanan",
    "lastName": "Alhajri",
    "email": "hanan@example.com",
    "password":"123"
}
```

### /api/v1/demo-controller

This page should premit the users from reaching it UNLESS you provide the token generated when you log in(authenticate)
<ol>
<li> Go to Authorization </li>
<li> Choose Type Bearer Token </li> 
<li> Then, provide the token generated to you when you logged in </li>
</ol>

