INSERT INTO categories(name)
SELECT 'General'
WHERE NOT EXISTS (
    SELECT * FROM categories WHERE name = 'General'
);

INSERT INTO categories(name)
SELECT 'Work'
WHERE NOT EXISTS (
    SELECT * FROM categories WHERE name = 'Work'
);

INSERT INTO categories(name)
SELECT 'Personal'
WHERE NOT EXISTS (
    SELECT * FROM categories WHERE name = 'Personal'
);