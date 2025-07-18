create database book_management;

create table book(
                     id serial primary key , title varchar(256), author varchar(256), price int, stock int
);

update book set title = 'newTitle',  author = 'newAuthor' , price = 4000
where id = 1;

delete from book where id = 1