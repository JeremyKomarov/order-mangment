INSERT INTO customer (first_name, last_name, email)
VALUES  ('Jeremy', 'Komarov', 'jeremy@test.com'),
        ('David', 'Zamil', 'david@test.com');

INSERT INTO customer_order (customer_id, item_name, price)
VALUES  (1, 'Basketball', 30.00),
        (2, 'Samsung', 2.00),
        (1, 'Iphone', 100.00)