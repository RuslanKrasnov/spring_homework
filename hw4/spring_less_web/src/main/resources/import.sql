BEGIN;

DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255), cost int, PRIMARY KEY (id));
INSERT INTO products (title, cost) VALUES ('milk', 44), ('bread', 37), ('orange', 120), ('juice', 99), ('apple', 110);

DROP TABLE customers IF EXISTS;
CREATE TABLE IF NOT EXISTS customers (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO customers (name) VALUES ('Alexander'), ('Bob'), ('John');

DROP TABLE buys IF EXISTS;
CREATE TABLE IF NOT EXISTS buys (id bigserial, product_id bigint, customer_id bigint, FOREIGN KEY (product_id) REFERENCES products (id), FOREIGN KEY (customer_id) REFERENCES customers (id), PRIMARY KEY (id));
INSERT INTO buys (product_id, customer_id) VALUES (1, 1), (2, 1), (3, 1), (4, 2), (5, 3), (1, 2), (2, 2), (3, 3), (4, 2);

COMMIT;