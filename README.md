![Screenshot 2024-06-21 160452](https://github.com/mayanksharma20/Bank-Management-System/assets/47239249/2d22336b-8bb6-419b-9bfa-aeeec1e5093e)
![Screenshot 2024-06-21 160513](https://github.com/mayanksharma20/Bank-Management-System/assets/47239249/eb4bd23a-86f0-47c4-9f55-fb71f73c4872)
![Screenshot 2024-06-21 160614](https://github.com/mayanksharma20/Bank-Management-System/assets/47239249/ffcefcb9-879e-4bef-b2be-6dab34526395)
![Screenshot 2024-06-21 160650](https://github.com/mayanksharma20/Bank-Management-System/assets/47239249/026c19b9-8215-483c-8f14-5d0dc23ef138)
![Screenshot 2024-06-21 160823](https://github.com/mayanksharma20/Bank-Management-System/assets/47239249/e0db93fa-49c0-42c2-acb0-c686dec7d32f)
![Screenshot 2024-06-21 160845](https://github.com/mayanksharma20/Bank-Management-System/assets/47239249/595b0e53-05f6-4d29-b5f4-3cf7634262dc)
![Screenshot 2024-06-21 160907](https://github.com/mayanksharma20/Bank-Management-System/assets/47239249/c79dbab9-2705-4063-98f6-816d8bcc500e)
![Screenshot 2024-06-21 160934](https://github.com/mayanksharma20/Bank-Management-System/assets/47239249/3c8b193a-2d03-4855-b801-020f9357418e)
![Screenshot 2024-06-21 161017](https://github.com/mayanksharma20/Bank-Management-System/assets/47239249/8ba15bfa-4a05-43a7-83c7-690253a63fa6)



QUERY FOR DATABASE

create database bankmanagementsystem;

use bankmanagementsystem;

create table signup(formno varchar(20),name varchar(20), father_name varchar(20),dob varchar(20),gender varchar(20),email varchar(30),marital_status varchar(20),address varchar(50), city varchar(20), pin varchar(20), state varchar(20));

create table signuptwo(formno varchar(20),religion varchar(20),category varchar(20),income varchar(20),education varchar(20),occupation varchar(20),pan varchar(20),aadhar varchar(20),seniorcitizen varchar(20),existingaccount varchar(20));

create table signupthree(formno varchar(20), accountType varchar(40), cardnumber varchar(25),pin varchar(10), facility varchar(100));
create table login(formno varchar(20),cardnumber varchar(25),pin varchar(10));

create table bank(pin varchar(10),date varchar(50),type varchar(20) ,amount varchar(20));


