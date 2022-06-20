create table if not exists products (id bigserial primary key, title varchar(255), cost int);

insert into products (title, cost)
values
    ('Milk', 50),
    ('Bread', 40),
    ('Apple', 100),
    ('Beer', 90),
    ('Orange', 120),
    ('Juice', 105),
    ('Water', 35),
    ('Cheese', 149),
    ('Chocolate', 200),
    ('Pineapple', 300),
    ('Onion', 44),
    ('Potato', 37),
    ('Meet', 498),
    ('Chicken', 297),
    ('Nuts', 1000),
    ('Bacon', 350),
    ('Pear', 189),
    ('Chips', 89),
    ('Wine', 629),
    ('Peach', 370);