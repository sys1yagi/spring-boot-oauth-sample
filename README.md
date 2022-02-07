# spring-boot-oauth-sample


# Setup

__Rename config file__

`src/main/resources/application-default.yml.tmp`

to 

`src/main/resources/application-default.yml`

__Set client id and secret__

set `google-app-client-id` and `google-app-client-secret`
see more https://developers.google.com/identity/protocols/oauth2

```yml
spring:
  security:
    oauth2:
      client:
        registration:
          google:
            clientId: $google-app-client-id
            clientSecret: $google-app-client-secret
```
