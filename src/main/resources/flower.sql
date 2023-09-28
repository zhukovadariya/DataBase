
CREATE TABLE flowerShop (
    id serial primary key,
	name_flower_shop varchar(255)
);

CREATE TABLE worker (
    flowerShop_id integer,
    foreign key (flowerShop_id) references flowerShop(id),
    name_worker varchar(255),
    contact integer,
    salary money,
    post varchar(255)
);

CREATE TABLE provider (
    name_provider varchar(255) primary key ,
    contact integer,
    count integer,
    price money
);

CREATE TABLE flowers (
    name_flower varchar(255) primary key,
    price money,
    count integer
);

CREATE TABLE client (
    id serial primary key,
    name_client varchar(255),
    contact integer,
    bonuses integer,
    age integer check (age > 0 and age < 100)
);



CREATE TABLE purchase (
id serial primary key,
   client_id integer,
    name_flower varchar(255),
    count integer
);
