CREATE TABLE address(

id bigint  NOT NULL AUTO_INCREMENT,
line1 VARCHAR(128) NOT NULL,
line2  VARCHAR(128) NOT NULL,
city VARCHAR(128) NOT NULL,
state VARCHAR(128) NOT NULL,
zipcode bigint,
PRIMARY KEY(id)
);

CREATE TABLE booking_entity (
    id bigint  NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(128) NOT NULL,
    last_name VARCHAR(128) NOT NULL,
    dateOfBirth DATE NOT NULL,
    checkinDate DATETIME,
    checkoutDate DATETIME,
    totalPrice FLOAT,
    deposit FLOAT,
    address_id int,
    FOREIGN KEY (address_id)
        REFERENCES address (id),
    PRIMARY KEY (id)
);