insert into products(products_id, description, name, price, uuid) values (nextval('seq_product'),'Iphone13','Iphone description',800000,md5(random()::text)::uuid);

insert into products(products_id, description, name, price, uuid) values (nextval('seq_product'),'OnePlus Nord CE2 Lite 5G','OnePlus Nord CE2 Lite 5G description',20000,md5(random()::text)::uuid);
insert into products(products_id, description, name, price, uuid) values (nextval('seq_product'),'OnePlus 7T','OnePlus 7T description',30000,md5(random()::text)::uuid);
insert into products(products_id, description, name, price, uuid) values (nextval('seq_product'),'Realme C35','Realme C35 description',13000,md5(random()::text)::uuid);
insert into products(products_id, description, name, price, uuid) values (nextval('seq_product'),'iPhone 14 Pro','iPhone 14 Pro description',90000,md5(random()::text)::uuid);
commit;