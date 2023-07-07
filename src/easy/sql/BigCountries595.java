package easy.sql;

public class BigCountries595 {
//    Create table If Not Exists Employees (id int, name varchar(20));
//    Create table If Not Exists EmployeeUNI (id int, unique_id int);
//    Truncate table Employees;
//    insert into Employees (id, name) values ('1', 'Alice');
//    insert into Employees (id, name) values ('7', 'Bob');
//    insert into Employees (id, name) values ('11', 'Meir');
//    insert into Employees (id, name) values ('90', 'Winston');
//    insert into Employees (id, name) values ('3', 'Jonathan');
//    Truncate table EmployeeUNI;
//    insert into EmployeeUNI (id, unique_id) values ('3', '1');
//    insert into EmployeeUNI (id, unique_id) values ('11', '2');
//    insert into EmployeeUNI (id, unique_id) values ('90', '3');
//
//
//    select unique_id, name from Employees left join EmployeeUNI on Employees.id = EmployeeUNI.id;
    //========================================

//    Create table If Not Exists Tweets
//            (
//                    tweet_id int,
//                    content  varchar(50)
//);
//    Truncate table Tweets;
//    insert into Tweets (tweet_id, content)
//    values ('1', 'Vote for Biden');
//    insert into Tweets (tweet_id, content)
//    values ('2', 'Let us make America great again!');
//
//    select tweet_id
//    from Tweets
//    where length(content) > 15;
    //================================================================
//Create table If Not Exists Teacher
//            (
//                    teacher_id int,
//                    subject_id int,
//                    dept_id    int
//            );
//    Truncate table Teacher;
//    insert into Teacher (teacher_id, subject_id, dept_id)
//    values ('1', '2', '3');
//    insert into Teacher (teacher_id, subject_id, dept_id)
//    values ('1', '2', '4');
//    insert into Teacher (teacher_id, subject_id, dept_id)
//    values ('1', '3', '3');
//    insert into Teacher (teacher_id, subject_id, dept_id)
//    values ('2', '1', '1');
//    insert into Teacher (teacher_id, subject_id, dept_id)
//    values ('2', '2', '1');
//    insert into Teacher (teacher_id, subject_id, dept_id)
//    values ('2', '3', '1');
//    insert into Teacher (teacher_id, subject_id, dept_id)
//    values ('2', '4', '1');
//
//    select teacher_id , count(distinct subject_id) cnt from Teacher group by teacher_id;
    //=======================================
//Create table If Not Exists Users
//            (
//                    account int,
//                    name    varchar(20)
//);
//    Create table If Not Exists Transactions
//            (
//                    trans_id      int,
//                    account       int,
//                    amount        int,
//                    transacted_on date
//            );
//    Truncate table Users;
//    insert into Users (account, name)
//    values ('900001', 'Alice');
//    insert into Users (account, name)
//    values ('900002', 'Bob');
//    insert into Users (account, name)
//    values ('900003', 'Charlie');
//    Truncate table Transactions;
//    insert into Transactions (trans_id, account, amount, transacted_on)
//    values ('1', '900001', '7000', '2020-08-01');
//    insert into Transactions (trans_id, account, amount, transacted_on)
//    values ('2', '900001', '7000', '2020-09-01');
//    insert into Transactions (trans_id, account, amount, transacted_on)
//    values ('3', '900001', '-3000', '2020-09-02');
//    insert into Transactions (trans_id, account, amount, transacted_on)
//    values ('4', '900002', '1000', '2020-09-12');
//    insert into Transactions (trans_id, account, amount, transacted_on)
//    values ('5', '900003', '6000', '2020-08-07');
//    insert into Transactions (trans_id, account, amount, transacted_on)
//    values ('6', '900003', '6000', '2020-09-07');
//    insert into Transactions (trans_id, account, amount, transacted_on)
//    values ('7', '900003', '-4000', '2020-09-11');
//
//
//    select Users.name NAME, sum(amount) BALANCE
//    from Users
//    join Transactions T on Users.account = T.account
//    group by Users.name
//    having sum(amount) > 10000;
//===============================================================
//Create table If Not Exists Prices
//            (
//                    product_id int,
//                    start_date date,
//                    end_date   date,
//                    price      int
//            );
//    Create table If Not Exists UnitsSold
//            (
//                    product_id    int,
//                    purchase_date date,
//                    units         int
//            );
//    Truncate table Prices;
//    insert into Prices (product_id, start_date, end_date, price)
//    values ('1', '2019-02-17', '2019-02-28', '5');
//    insert into Prices (product_id, start_date, end_date, price)
//    values ('1', '2019-03-01', '2019-03-22', '20');
//    insert into Prices (product_id, start_date, end_date, price)
//    values ('2', '2019-02-01', '2019-02-20', '15');
//    insert into Prices (product_id, start_date, end_date, price)
//    values ('2', '2019-02-21', '2019-03-31', '30');
//    Truncate table UnitsSold;
//    insert into UnitsSold (product_id, purchase_date, units)
//    values ('1', '2019-02-25', '100');
//    insert into UnitsSold (product_id, purchase_date, units)
//    values ('1', '2019-03-01', '15');
//    insert into UnitsSold (product_id, purchase_date, units)
//    values ('2', '2019-02-10', '200');
//    insert into UnitsSold (product_id, purchase_date, units)
//    values ('2', '2019-03-22', '30');
//
//
//
//    select US.product_id, () sum(units)
//    from Prices
//    join UnitsSold US on Prices.product_id = US.product_id
//    group by US.product_id;
//
//    select US.product_id,
//    round(cast(sum(units * Prices.price) as decimal(30, 20)) / sum(units), 2) average_price
//    from Prices
//    join UnitsSold US on Prices.product_id = US.product_id
//    where purchase_date between start_date and end_date
//    group by US.product_id;


    //1068. Product Sales Analysis I
//    select product_name, year, price from Sales join Product on Sales.product_id = Product.product_id;




}
