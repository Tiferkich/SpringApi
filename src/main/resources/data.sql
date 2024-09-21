CREATE TABLE IF NOT EXISTS USERS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(255),
    age INT,
    country VARCHAR(255)
    );
INSERT INTO users (firstname, age, country) VALUES ('Daniel', 10, 'RUSSIA');
INSERT INTO users (firstname, age, country) VALUES ('Nikita', 20, 'KOREA');
INSERT INTO users (firstname, age, country) VALUES ('Jerry', 10, 'USA');
INSERT INTO users (firstname, age, country) VALUES ('Cherry', 20, 'USA');
INSERT INTO users (firstname, age, country) VALUES ('Rita', 10, 'JAPAN');
INSERT INTO users (firstname, age, country) VALUES ('Chinh-chong', 20, 'CHINA');
