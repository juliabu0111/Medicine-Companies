insert into CLINIC(clinic_id,clinic_name,address,num_staff)
values (1,'Forest Park','Харків, вул.Старопраментська, 4',280);
insert into CLINIC(clinic_id,clinic_name,address,num_staff)
values (2,'Sumner Regional','Кіровоград, вул.Княгині Ольги-1А, 15',175);
insert into CLINIC(clinic_id,clinic_name,address,num_staff)
values (3,'St. Luke’s','Львів, вул.Зелена, 5A',560);
insert into CLINIC(clinic_id,clinic_name,address,num_staff)
values (4,'Matilda International','Київ, вул.Князя Володимира, 21',620);
insert into CLINIC(clinic_id,clinic_name,address,num_staff)
values (5,'Providence BioMed','Одеса, вул. Пушкінська, 8',310);
insert into CLINIC(clinic_id,clinic_name,address,num_staff)
values (6,'Para-paradise','Тернопіль, вул.Олени Теліги, 2',430);

insert into WORKER(worker_id,w_name,w_company,w_position)
values (2314,'Князь Ігор Андрійович','Matilda International','Кардіолог');
insert into WORKER(worker_id,w_name,w_company,w_position)
values (1261,'Юрченко Марія Петрівна','Providence BioMed','Хірург');
insert into WORKER(worker_id,w_name,w_company,w_position)
values (2114,'Марко Сергій Романович','Forest Park','Невропатолог');
insert into WORKER(worker_id,w_name,w_company,w_position)
values (3512,'Кірова Ольга Степанівна','Para-paradise','Стоматолог');
insert into WORKER(worker_id,w_name,w_company,w_position)
values (1436,'Шумков Тарас Миколайович','St. Luke’s','Головний лікар');
insert into WORKER(worker_id,w_name,w_company,w_position)
values (1862,'Кум Віра Ярославівна','Sumner Regional','Нейрохірург');
insert into WORKER(worker_id,w_name,w_company,w_position)
values (3147,'Коберник Іванна Юріївна','Matilda International','Офтальмолог');
insert into WORKER(worker_id,w_name,w_company,w_position)
values (2644,'Крунь Лілія Григорівна','Para-paradise','Лаборант');
insert into WORKER(worker_id,w_name,w_company,w_position)
values (3219,'Дорош Вікторія Олександрівна','Providence BioMed','Ревматолог');

insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (1,'Кардіолог', 5, 17000);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (2, 'Невропатолог', 2, 8600);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (3, 'Нейрохірург', 6, 11900);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (4, 'Педіатр', 2, 6000);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (5, 'Ревматолог', 2, 6700);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (6, 'Терапевт', 3, 7100);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (7, 'Хірург', 5, 15800);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (8, 'Офтальмолог', 3, 7500);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (9, 'Стоматолог', 5, 21300);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (10, 'Лаборант', 1, 7800);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (11, 'Інтерн', 1, 3000);
insert into ACCOUNTING(position_id,name_position,need_experience,salary)
values (12, 'Головний лікар', 3, 35000);