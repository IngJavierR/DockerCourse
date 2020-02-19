# Commands

´´´bash
docker-compose down --rmi all

docker build -t practica .
docker run --rm -d -p 8090:80 -v $(pwd)/public:/var/www/html practica
´´´

´´´bash
docker run --rm -d -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=project123 -e POSTGRES_DB=mysystem postgres
´´´

´´´compile
docker build -t catalogos -f Dockerfile-compile .
docker run --rm -d -p 8090:8090 catalogos
´´´

´´´sql
create table users
(
	id int not null primary key,
	ds_name varchar(200),
	ds_lastname varchar(200),
	age int
);

insert into users values (1,'Javier', 'Rodriguez', 10);
insert into users values (2,'Jose', 'Lopez', 10);
insert into users values (3,'Pedro', 'Morales', 10);
insert into users values (4,'Antonio', 'Hernandez', 10);


select * from users;
´´´
Steps:

PPT
VOLUMES
DOCKERFILE JUST SERVICE
DOCKER DATABASE
DOCKER-COMPILE
DOCKER COMPOSE