DROP TABLE IF EXISTS customer_order;
DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL DEFAULT '',
    last_name VARCHAR(100) NOT NULL DEFAULT '',
    email VARCHAR(100) NOT NULL DEFAULT ''
);

CREATE TABLE customer_order (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT NOT NULL,
    item_name VARCHAR(100) NOT NULL DEFAULT '',
    price DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    CONSTRAINT fk_customer FOREIGN KEY (customer_id) REFERENCES customer(id)
);
