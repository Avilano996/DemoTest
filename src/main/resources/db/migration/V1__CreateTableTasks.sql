CREATE TABLE "usertest"
(
    id bigserial NOT NULL,
    name varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    create_date timestamp,
    active boolean,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)
    WITH (
        OIDS=FALSE
    );
ALTER TABLE "usertest"
    OWNER TO test_user;