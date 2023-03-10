
--вставить в ячейку новое значение
UPDATE student SET role = 'student' WHERE student_id = 1;
UPDATE teacher SET role = 'teacher' WHERE teacher_id = 1;

--вставить в таблицу новый столбец
ALTER TABLE student ADD role character varying(20);

ALTER TABLE teacher ADD role character varying(20);

ALTER TABLE lesson_test ADD isFinished boolean;

-- удаление данных
DELETE FROM question WHERE question_id = 10

-- удаление столбца
ALTER TABLE course DROP COLUMN issubscribed
