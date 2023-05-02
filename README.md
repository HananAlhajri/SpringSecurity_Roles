# SpringSecurity_Roles
Build simple project with descreption for spring security

# Tools utilized:
<li>Spring Web</li>
<li>Spring Security</li>
<li>MySQL Drivet </li>

# Tested Using PostMan: 

## http://localhost:8081/api/v1/auth/authenticate

{
    "email": "hanan@example.com",
    "password":"123"
}

## http://localhost:8081/api/v1/auth/register

{
    "firstName": "Hanan",
    "lastName": "Alhajri",
    "email": "hanan@example.com",
    "password":"123"
}


## http://localhost:8081/api/v1/demo-controller

this page should premit the users from reaching it UNLESS you provide the token generated when you log in 

> Go to Authorization 
> Choose Type Berare Token 
> Then, provide the token generated to you when you entered.

