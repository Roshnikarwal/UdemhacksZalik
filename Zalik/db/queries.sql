-- Create the 'doctors' table with auto-incrementing doctorId as the primary key
CREATE TABLE doctors (
    doctorId INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    clinic TEXT NOT NULL,
    phone TEXT NOT NULL,
    clinic_address TEXT NOT NULL,
    is_available BOOLEAN NOT NULL
);

-- Create the 'patients' table with auto-incrementing patientId and foreign key referencing doctorId
CREATE TABLE patients (
    patientId INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    phone TEXT NOT NULL,
    has_a_doctor BOOLEAN NOT NULL,
    postal_code TEXT NOT NULL,
    doctorId INTEGER,
    FOREIGN KEY (doctorId) REFERENCES doctors(doctorId)
);

-- Insert sample data into 'doctors' table
INSERT INTO doctors (name, email, password, clinic, phone, clinic_address, is_available)
VALUES 
    ('Dr. John Doe', 'john.doe@example.com', 'securepass123', 'Health Clinic', '555-1234', '123 Main St', 1),
    ('Dr. Jane Smith', 'jane.smith@example.com', 'mypassword456', 'Wellness Center', '555-5678', '456 Oak Ave', 0),
    ('Dr. Emily Brown', 'emily.brown@example.com', 'doctorpass789', 'City Hospital', '555-8765', '789 Pine Rd', 1);

-- Insert sample data into 'patients' table
INSERT INTO patients (name, email, password, phone, has_a_doctor, postal_code, doctorId)
VALUES 
    ('Alice Green', 'alice.green@example.com', 'alicepass111', '555-1111', 1, '12345', 1),
    ('Bob White', 'bob.white@example.com', 'bobpass222', '555-2222', 0, '67890', NULL),
    ('Charlie Black', 'charlie.black@example.com', 'charliepass333', '555-3333', 1, '11223', 3);
