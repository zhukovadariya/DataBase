insert into floweShop (name_flower_shop) values ('Алая роза');
insert into floweShop (name_flower_shop) values ('Весенний тюльпан');

insert into worker(name_worker, contact, salary, post ) values ('Валентин', 12345, 40000, 'менеджер' );
insert into worker(name_worker, contact, salary, post ) values ('Ольга', 12347, 20000, 'флорист' );
insert into worker(name_worker, contact, salary, post ) values ('Алла', 12348, 80000, 'администратор' );

insert into provider(name_provider, contact, count, price) values ('Виктор', 23456, 80, 40000);
insert into provider(name_provider, contact, count, price) values ('Константин', 23453, 100, 59000);

insert into flowers(name_flower, price, count) values ('Розы', 200, 80);
insert into flowers(name_flower, price, count) values ('Ромашки', 100, 30);
insert into flowers(name_flower, price, count) values ('Герберы', 300, 50);
insert into flowers(name_flower, price, count) values ('Тюльпаны', 150, 100);

insert into client(name_client, contact, bonuses, age) values ('Анна', 14567, 100, 34);
insert into client(name_client, contact, bonuses, age) values ('Павел', 1545678, 1400, 45);
insert into client(name_client, contact, bonuses, age) values ('Ксения', 1587654, 800, 22);

insert into purchase(name_flower, count, purchases_time) values ('Розы', 11);
insert into purchase(name_flower, count, purchases_time) values ('Ромашки', 33);

insert into purchaseInShop(client_id, flowerShop_id) values (1, 2), (1, 1), (2, 1), (2, 2), (3, 1), (3, 2);


