CREATE TABLE sptihospital.branch (

  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(32) NULL,
  address VARCHAR(128) NULL,
  PRIMARY KEY (id));
  
  CREATE TABLE sptihospital.ward (
    ward_id INT AUTO_INCREMENT PRIMARY KEY,
    ward_name VARCHAR(50) NOT NULL,
    max_capacity INT NOT NULL,
    current_occupancy INT DEFAULT 0,
    floor_number INT NOT NULL,
    wing VARCHAR(20) NOT NULL,
    branch INT NOT NULL,
    status VARCHAR(20) DEFAULT 'Active',
    charges INT NULL,
    FOREIGN KEY (branch) REFERENCES spti.branch(id)
);


CREATE TABLE sptihospital.cot (
    cot_id INT AUTO_INCREMENT PRIMARY KEY,
    cot_number INT NOT NULL,
    ward_id INT NOT NULL,
    status VARCHAR(20) DEFAULT 'Available',
    patient_id INT UNIQUE,
    FOREIGN KEY (ward_id) REFERENCES spti.ward(ward_id),
    FOREIGN KEY (patient_id) REFERENCES spti.patients(patient_id)
);
  