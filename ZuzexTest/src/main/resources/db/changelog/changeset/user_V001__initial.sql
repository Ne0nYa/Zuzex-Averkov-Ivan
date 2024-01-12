CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY UNIQUE,
    username VARCHAR(64) NOT NULL,
    age int NOT NULL,
    password VARCHAR(64)  NOT NULL
);

CREATE TABLE IF NOT EXISTS houses (
    id BIGSERIAL PRIMARY KEY UNIQUE,
    address VARCHAR(64) NOT NULL,
    owner_id int NOT NULL,

    CONSTRAINT fk_owner_id FOREIGN KEY (owner_id) REFERENCES users (id)
);

CREATE TABLE usersHouses (
    id BIGSERIAL PRIMARY KEY UNIQUE,
    user_id bigint NOT NULL,
    house_id bigint NOT NULL,

    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT fk_house_id FOREIGN KEY (house_id) REFERENCES houses (id)
);