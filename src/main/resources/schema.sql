CREATE TABLE Doctor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    specialization VARCHAR(255)
);

CREATE TABLE Patient (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    doctor_id BIGINT,
    CONSTRAINT fk_doctor FOREIGN KEY (doctor_id) REFERENCES Doctor(id)
);