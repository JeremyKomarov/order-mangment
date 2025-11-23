INSERT INTO customer (first_name, last_name, email, customer_status)
VALUES  ('Jeremy', 'Komarov', 'jeremy@test.com', 'VIP'),
        ('Yossi', 'zad', 'Yossi@test.com', 'REGULAR'),
        ('David', 'Zamil', 'david@test.com', 'VIP'),
        ('Yossi', 'Lucky', 'YossiLuck@test.com', 'REGULAR'),
        ('Jeremy', 'Zivon', 'Jeremy2@test.com', 'REGULAR'),
        ('david', 'zad', 'david@test.com', 'VIP'),
        ('da', 'sddd', 'da@test.com', 'REGULAR'),
        ('yossi', 'qwe', 'yossi@test.com', 'VIP');


INSERT INTO customer_order (customer_id, item_name, price)
VALUES  (1, 'Basketball', 30.00),
        (2, 'Samsung', 2.00),
        (1, 'Iphone', 100.00)