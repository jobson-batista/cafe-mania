create database cafemania;
show databases;
use cafemania;

create table cafe(
	id int primary key auto_increment,
    name varchar(100) not null,
    description varchar(500) not null,
    weight int not null,
    price decimal(10,2) not null,
    type int not null,
    roast int not null
);

show tables;

describe cafe;

select * from cafe;

insert into cafe(name, description, weight, price, type, roast) 
values (
	'Café Orfeu Clássico em grãos 1 kg',
	'O Café em Grãos Orfeu Clássico 1KG é um café especial em grãos 100% Arábica, equilibrado e de torra média. O grão de café apresenta notas florais, frutadas e de caramelo. Possui doçura alta, acidez equilibrada, corpo aveludado e aromas complexos, com uma finalização persistente e prazerosa. Sua intensidade é equivalente a 6.',
	1000,
    96.99,
    1,
    2
);


