drop table if exists products cascade;
create table products (
  id bigserial,
  title varchar(255),
  description varchar(5000),
  price numeric(8, 2),
  primary key(id)
);

insert into products
(title, description, price)
values
  ('Milk', 'White', 80.0),
  ('Bread', 'Black', 30.0),
  ('Fruits', 'Green', 50.0),
  ('Cheese', 'Yellow', 100.0),
  ('Sausage', 'Red', 95.0)
;