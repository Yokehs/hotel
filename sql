CREATE TABLE IF NOT EXISTS hotel.employee
(
    id integer NOT NULL,
    firstname character varying(20) COLLATE pg_catalog."default" NOT NULL,
    surname character varying(20) COLLATE pg_catalog."default" NOT NULL,
    secondname character varying(20) COLLATE pg_catalog."default",
    phonenumber character varying(16) COLLATE pg_catalog."default",
    CONSTRAINT employee_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS hotel.employee
    OWNER to postgres;