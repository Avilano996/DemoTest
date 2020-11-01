GET localhost:8080/v1/api/usertest
$ curl --location --request GET 'localhost:8080/v1/api/usertest'

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

GET localhost:8080/v1/api/usertest/{id}
$ curl --location --request GET 'localhost:8080/v1/api/usertest/{id}'

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

POST localhost:8080/v1/api/usertest/
{
    "id": {id},
    "name": "Test Post",
    "email": "testPost2@test.test",
    "createDate": "2020-10-29T18:00:00.000+00:00",
    "createdAt": "2020-10-30T18:26:50.891529",
    "updatedAt": "2020-10-30T18:26:50.891529"
}

$ curl --location --request POST 'localhost:8080/v1/api/usertest/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": {id},
        "name": "Test Post",
        "email": "testPost2@test.test",
        "createDate": "2020-10-29T18:00:00.000+00:00",
        "createdAt": "2020-10-30T18:26:50.891529",
        "updatedAt": "2020-10-30T18:26:50.891529"
}'

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

PUT localhost:8080/v1/api/usertest/{id}

{
        "id": {id},
        "name": "Test Put2 Post",
        "email": "testPost2@test.test",
        "createDate": "2020-10-29T18:00:00.000+00:00"
    }

$ curl --location --request PUT 'localhost:8080/v1/api/usertest/{id}' \
--header 'Content-Type: application/json' \
--data-raw '{
  "name": "Test Post",
        "email": "testPost2@test.test",
        "createDate": "2020-10-29T18:00:00.000+00:00",
        "createdAt": "2020-10-30T18:26:50.891529",
        "updatedAt": "2020-10-30T18:26:50.891529"
}'

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

DELETE localhost:8080/v1/api/usertest/{id}

curl --location --request DELETE 'localhost:8080/v1/api/usertest/{id}'
