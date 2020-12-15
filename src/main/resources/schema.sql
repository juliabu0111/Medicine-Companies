CREATE TABLE CLINIC(       -- МЕД.ЗАКЛАД
clinic_id INT primary key,    -- ідент. номер клініки
clinic_name VARCHAR (250),    -- назва клініки
address VARCHAR (250),        -- адреса
num_staff INT                 -- к-сть працюючого персоналу
);

CREATE TABLE WORKER(       -- ПРАЦІВНИКИ ЗАКЛАДУ
worker_id INT primary key,    -- ідент. номер працівника
w_name VARCHAR(250),          -- ПІП
w_company VARCHAR (250),      -- назва закладу роботи
w_position VARCHAR(250)       -- посада
);

CREATE TABLE ACCOUNTING(   -- БУХГАЛТЕРІЯ
position_id INT primary key,  -- інент. номер посади
name_position VARCHAR(250),   -- посада
need_experience INT,          -- необхідний досвід роботи
salary INT NOT NULL           -- заробітна плата за місяць
);
