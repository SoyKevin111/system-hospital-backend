CREATE TABLE "user" (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL CHECK (role IN ('ADMIN','DOCTOR','NURSE','ACCOUNTING_MANAGER','PATIENT')),
    status BOOLEAN,
    created_at TIMESTAMP,
    last_updated TIMESTAMP,
    profile_id BIGINT UNIQUE
);

CREATE TABLE profile (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT UNIQUE,
    CONSTRAINT fk_profile_user FOREIGN KEY (user_id) REFERENCES "user"(id)
);

CREATE TABLE doctor (
    id BIGINT PRIMARY KEY,
    CONSTRAINT fk_doctor_user FOREIGN KEY (id) REFERENCES "user"(id)
);

CREATE TABLE mastery (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    code VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION NOT NULL
);

CREATE TABLE doctor_mastery (
    id_doctor BIGINT NOT NULL,
    id_mastery BIGINT NOT NULL,
    CONSTRAINT pk_doctor_mastery PRIMARY KEY (id_doctor, id_mastery),
    CONSTRAINT fk_dm_doctor FOREIGN KEY (id_doctor) REFERENCES doctor(id),
    CONSTRAINT fk_dm_mastery FOREIGN KEY (id_mastery) REFERENCES mastery(id)
);

CREATE TABLE diagnosis (
    id BIGSERIAL PRIMARY KEY,
    observations VARCHAR(255) NOT NULL
);

CREATE TABLE vital_sign (
    id BIGSERIAL PRIMARY KEY,
    temperature DOUBLE PRECISION NOT NULL,
    cough BOOLEAN NOT NULL,
    fatigue BOOLEAN NOT NULL,
    fever BOOLEAN NOT NULL,
    headache BOOLEAN NOT NULL,
    sore_throat BOOLEAN NOT NULL
);

CREATE TABLE diagnosis_vital_sign (
    id_diagnosis BIGINT NOT NULL,
    id_vital_sign BIGINT NOT NULL,
    CONSTRAINT pk_diagnosis_vital PRIMARY KEY (id_diagnosis, id_vital_sign),
    CONSTRAINT fk_dv_diagnosis FOREIGN KEY (id_diagnosis) REFERENCES diagnosis(id),
    CONSTRAINT fk_dv_vitalsign FOREIGN KEY (id_vital_sign) REFERENCES vital_sign(id)
);

CREATE TABLE recipe (
    id BIGSERIAL PRIMARY KEY
);

CREATE TABLE medical_supply (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    price NUMERIC(38,2) NOT NULL
);

CREATE TABLE recipe_medical_supply (
    id_recipe BIGINT NOT NULL,
    id_medical_supply BIGINT NOT NULL,
    CONSTRAINT pk_recipe_supply PRIMARY KEY (id_recipe, id_medical_supply),
    CONSTRAINT fk_rms_recipe FOREIGN KEY (id_recipe) REFERENCES recipe(id),
    CONSTRAINT fk_rms_supply FOREIGN KEY (id_medical_supply) REFERENCES medical_supply(id)
);

CREATE TABLE appointment (
    id BIGSERIAL PRIMARY KEY,
    date TIMESTAMP(6) NOT NULL,
    created_at TIMESTAMP(6) NOT NULL,
    last_updated TIMESTAMP(6),
    status VARCHAR(255) NOT NULL CHECK (status IN ('ASSIGNED','IN_PROGRESS','FINISHED')),
    id_patient BIGINT NOT NULL,
    id_doctor BIGINT,
    id_mastery BIGINT,
    id_diagnosis BIGINT UNIQUE,
    id_recipe BIGINT UNIQUE,
    CONSTRAINT fk_app_patient FOREIGN KEY (id_patient) REFERENCES "user"(id),
    CONSTRAINT fk_app_doctor FOREIGN KEY (id_doctor) REFERENCES doctor(id),
    CONSTRAINT fk_app_mastery FOREIGN KEY (id_mastery) REFERENCES mastery(id),
    CONSTRAINT fk_app_diagnosis FOREIGN KEY (id_diagnosis) REFERENCES diagnosis(id),
    CONSTRAINT fk_app_recipe FOREIGN KEY (id_recipe) REFERENCES recipe(id)
);

CREATE TABLE invoice (
    id BIGSERIAL PRIMARY KEY,
    code VARCHAR(255),
    subtotal DOUBLE PRECISION NOT NULL,
    total DOUBLE PRECISION NOT NULL,
    appointment_id BIGINT NOT NULL UNIQUE,
    created_at TIMESTAMP(6) NOT NULL,
    CONSTRAINT fk_invoice_appointment FOREIGN KEY (appointment_id) REFERENCES appointment(id)
);
