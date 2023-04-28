
/* Drop Triggers */

DROP TRIGGER TRI_Ch_Restaurant_Review_ch_id;
DROP TRIGGER TRI_Ja_Restaurant_Review_ja_id;
DROP TRIGGER TRI_ko_Restaurant_Review_ko_id;
DROP TRIGGER TRI_Restaurant_restaurant_id;
DROP TRIGGER TRI_We_Restaurant_Review_we_id;



/* Drop Tables */

DROP TABLE Ch_Restaurant_Review CASCADE CONSTRAINTS;
DROP TABLE Ja_Restaurant_Review CASCADE CONSTRAINTS;
DROP TABLE ko_Restaurant_Review CASCADE CONSTRAINTS;
DROP TABLE We_Restaurant_Review CASCADE CONSTRAINTS;
DROP TABLE Restaurant CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_Ch_Restaurant_Review_ch_id;
DROP SEQUENCE SEQ_Ja_Restaurant_Review_ja_id;
DROP SEQUENCE SEQ_ko_Restaurant_Review_ko_id;
DROP SEQUENCE SEQ_Restaurant_restaurant_id;
DROP SEQUENCE SEQ_We_Restaurant_Review_we_id;




/* Create Sequences */

CREATE SEQUENCE SEQ_Ch_Restaurant_Review_ch_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Ja_Restaurant_Review_ja_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_ko_Restaurant_Review_ko_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Restaurant_restaurant_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_We_Restaurant_Review_we_id INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE Ch_Restaurant_Review
(
	ch_id number(20) NOT NULL,
	restaurant_id number(50) NOT NULL,
	review_rating number(20) DEFAULT null,
	PRIMARY KEY (ch_id)
);


CREATE TABLE Ja_Restaurant_Review
(
	ja_id number(20) NOT NULL,
	restaurant_id number(50) NOT NULL,
	review_rating number(20) DEFAULT null,
	PRIMARY KEY (ja_id)
);


CREATE TABLE ko_Restaurant_Review
(
	ko_id number(20) NOT NULL,
	restaurant_id number(50) NOT NULL,
	review_rating number(20) DEFAULT null,
	PRIMARY KEY (ko_id)
);


CREATE TABLE Restaurant
(
	restaurant_id number(50) NOT NULL,
	restaurant_name varchar2(20) NOT NULL,
	main_menu varchar2(20) NOT NULL,
	price number(20) NOT NULL,
	adress varchar2(20) NOT NULL,
	PRIMARY KEY (restaurant_id)
);


CREATE TABLE We_Restaurant_Review
(
	we_id number(20) NOT NULL,
	restaurant_id number(50) NOT NULL,
	review_rating number(20) DEFAULT null,
	PRIMARY KEY (we_id)
);



/* Create Foreign Keys */

ALTER TABLE Ch_Restaurant_Review
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;


ALTER TABLE Ja_Restaurant_Review
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;


ALTER TABLE ko_Restaurant_Review
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;


ALTER TABLE We_Restaurant_Review
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_Ch_Restaurant_Review_ch_id BEFORE INSERT ON Ch_Restaurant_Review
FOR EACH ROW
BEGIN
	SELECT SEQ_Ch_Restaurant_Review_ch_id.nextval
	INTO :new.ch_id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_Ja_Restaurant_Review_ja_id BEFORE INSERT ON Ja_Restaurant_Review
FOR EACH ROW
BEGIN
	SELECT SEQ_Ja_Restaurant_Review_ja_id.nextval
	INTO :new.ja_id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_ko_Restaurant_Review_ko_id BEFORE INSERT ON ko_Restaurant_Review
FOR EACH ROW
BEGIN
	SELECT SEQ_ko_Restaurant_Review_ko_id.nextval
	INTO :new.ko_id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_Restaurant_restaurant_id BEFORE INSERT ON Restaurant
FOR EACH ROW
BEGIN
	SELECT SEQ_Restaurant_restaurant_id.nextval
	INTO :new.restaurant_id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_We_Restaurant_Review_we_id BEFORE INSERT ON We_Restaurant_Review
FOR EACH ROW
BEGIN
	SELECT SEQ_We_Restaurant_Review_we_id.nextval
	INTO :new.we_id
	FROM dual;
END;

/




