# Commands

´´´bash
docker-compose down --rmi all

docker build -t practica .
docker run --rm -d -p 8090:80 -v $(pwd)/public:/var/www/html practica
´´´

´´´compile
docker build -t catalogos -f Dockerfile-compile .
docker run --rm -d -p 8090:8090 catalogos
´´´

´´´sql
create table users
(
	id serial not null
		constraint table_name_pk
			primary key,
	ds_name varchar(200),
	ds_lastname varchar(200),
	age int
);
´´´


