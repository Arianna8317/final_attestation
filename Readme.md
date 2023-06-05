Итоговая контрольная работа

Информация о проекте
Необходимо организовать систему учета для питомника, в котором живут домашние и вьючные животные.

Как сдавать проект
Для сдачи проекта необходимо создать отдельный общедоступный репозиторий(Github).
Разработку вести в этом репозитории, использовать пул реквесты на изменения.
Программа должна запускаться и работать, ошибок при выполнении программы быть не должно.

Задания и ход выполнения работы

Создание репозиторий на github.  Рабочая директория и клон репозитория.

mkdir final-attestation
cd .\final-attestation\
git clone https://github.com/Arianna8317/final_attestation.git

1. 
Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).

<image src="images\image1.png" >


2. Создать директорию, переместить файл туда.

<image src="images\image2.png" >

3. Подключить дополнительный репозиторий MySQL. 

<image src="images\image3.png" >

4. Установить любой пакет из этого репозитория.
Установить и удалить deb-пакет с помощью dpkg.
Выложить историю команд в терминале ubuntu

<image src="images\image4.png" >

5. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы.

<image src="images\bd_structure.drawio" >

6. В подключенном MySQL репозитории создать базу данных “Друзья человека”

CREATE DATABASE Human_friends

7. Создать таблицы с иерархией из диаграммы в БД

``` SQL

CREATE TABLE IF NOT EXISTS animals_groups
(
 group_id INT AUTO_INCREMENT PRIMARY KEY,
 group_name VARCHAR(20) NOT NULL
);

INSERT INTO animals_groups (group_name)
VALUES
('вьючные'),
('домашние');

CREATE TABLE IF NOT EXISTS pack_animals
(
 animal_id INT AUTO_INCREMENT PRIMARY KEY,
 animal_name VARCHAR(20) NOT NULL,
 group_id int NOT NULL,
 FOREIGN KEY (group_id) REFERENCES animals_groups (group_id) 
);

INSERT INTO pack_animals (animal_name, group_id)
VALUES
('Лошади', 1),
('Ослы', 1),
('Верблюды', 1);


CREATE TABLE IF NOT EXISTS pets
(
 pet_id INT AUTO_INCREMENT PRIMARY KEY,
 pet_name VARCHAR(20) NOT NULL,
 group_id int NOT NULL,
 FOREIGN KEY (group_id) REFERENCES animals_groups (group_id) 
);

INSERT INTO pets (pet_name, group_id)
VALUES
('Кошки', 2),
('Собаки', 2),
('Хомяки', 2);


CREATE TABLE IF NOT EXISTS donkeys
(
 donkey_id INT AUTO_INCREMENT PRIMARY KEY,
 donkey_name VARCHAR(20)  NOT NULL,
 birthday DATE NOT NULL,
 command VARCHAR(20),
 animal_id int NOT NULL,
 FOREIGN KEY (animal_id) REFERENCES pack_animals (animal_id) 
);

INSERT INTO donkeys (donkey_name, birthday, command, animal_id)
VALUES
('Вася', '2020-02-03', 'Голос!', 2),
('Кира', '2023-01-12', 'Пить!', 2),
('Катя', '2022-07-11', 'Бежать!', 2);


CREATE TABLE IF NOT EXISTS horses
(
 horse_id INT AUTO_INCREMENT PRIMARY KEY,
 horse_name VARCHAR(20)  NOT NULL,
 birthday DATE NOT NULL,
 command VARCHAR(20),
 animal_id int NOT NULL,
 FOREIGN KEY (animal_id) REFERENCES pack_animals (animal_id) 
);

INSERT INTO horses (horse_name, birthday, command, animal_id)
VALUES
('Том', '2021-03-12', 'Направо!', 1),
('Маня', '2022-07-11', 'Ну!', 1),
('Молния', '2021-06-12', 'Стоп!', 1);


CREATE TABLE IF NOT EXISTS camels
(
 camel_id INT AUTO_INCREMENT PRIMARY KEY,
 camel_name VARCHAR(20)  NOT NULL,
 birthday DATE NOT NULL,
 command VARCHAR(20),
 animal_id int NOT NULL,
 FOREIGN KEY (animal_id) REFERENCES pack_animals (animal_id) 
);

INSERT INTO camels (camel_name, birthday, command, animal_id)
VALUES
('Вася', '2020-01-01', 'Право!', 3),
('Таня', '2020-11-10', 'Лево!', 3),
('Блох', '2020-03-12', 'Стой!', 3);


CREATE TABLE IF NOT EXISTS cats
(
 cat_id INT AUTO_INCREMENT PRIMARY KEY,
 cat_name VARCHAR(20)  NOT NULL,
 birthday DATE NOT NULL,
 command VARCHAR(20),
 pet_id int NOT NULL,
 FOREIGN KEY (pet_id) REFERENCES pets (pet_id) 
);

INSERT INTO cats (cat_name, birthday, command, pet_id)
VALUES
('Рыжик', '2022-07-11', 'Есть!', 1),
('Барсик', '2022-07-11', 'Спать!', 1),
('Мурзик', '2021-07-11', 'Урчать!', 1);


CREATE TABLE IF NOT EXISTS dogs
(
 dog_id INT AUTO_INCREMENT PRIMARY KEY,
 dog_name VARCHAR(20)  NOT NULL,
 birthday DATE NOT NULL,
 command VARCHAR(20),
 pet_id int NOT NULL,
 FOREIGN KEY (pet_id) REFERENCES pets (pet_id) 
);

INSERT INTO dogs (dog_name, birthday, command, pet_id)
VALUES
('Барбос', '2020-11-10', 'Сидеть!', 2),
('Рекс', '2020-01-01', 'В погоню!', 2);


CREATE TABLE IF NOT EXISTS hamsters
(
 hamster_id INT AUTO_INCREMENT PRIMARY KEY,
 hamster_name VARCHAR(20)  NOT NULL,
 birthday DATE NOT NULL,
 command VARCHAR(20),
 pet_id int NOT NULL,
 FOREIGN KEY (pet_id) REFERENCES pets (pet_id) 
);

INSERT INTO hamsters (hamster_name, birthday, command, pet_id)
VALUES
('Луша', '2022-03-12', 'Смирно!', 3),
('Пушок', '2023-01-01', 'Спать!', 3);
```

