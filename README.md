# SpringSecurity_Roles
Build simple project with descreption for spring security

# Tools utilized:
<li>Spring Web</li>
<li>Spring Security</li>
<li>MySQL Drivet </li>

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
<li> Choose Type Berare Token </li> 
<li> Then, provide the token generated to you when you entered </li>
</ol>

