INSERT INTO customer (first_name, last_name, email)
VALUES  ('Jeremy', 'Komarov', 'jeremy@test.com'),
        ('Yossi', 'zad', 'Yossi@test.com'),
        ('David', 'Zamil', 'david@test.com'),
        ('Yossi', 'Lucky', 'YossiLuck@test.com'),
        ('Jeremy', 'Zivon', 'Jeremy2@test.com'),
        ('david', 'zad', 'david@test.com'),
        ('da', 'sddd', 'da@test.com'),
        ('yossi', 'qwe', 'yossi@test.com');


INSERT INTO customer_order (customer_id, item_name, price)
VALUES  (1, 'Basketball', 30.00),
        (2, 'Samsung', 2.00),
        (1, 'Iphone', 100.00)