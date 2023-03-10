--функция проверки ответа
CREATE OR REPLACE FUNCTION public.check_question(question integer, answ text)
    RETURNS integer AS $$
	DECLARE
		res integer;
	BEGIN
		SELECT value FROM public.answer
		WHERE question_id = question AND variant = answ
		INTO res;
		RETURN res;
	END;
$$ LANGUAGE plpgsql;

--------------------------------------------------
{
answers: {
1: a,
2: [d,a]
3: c
4: [a,c]
},
testId: 3
}
--проверка работы функции
INSERT INTO question (title) VALUES ('Какого цвета динозавр');
INSERT INTO answer (question_id, variant, value) VALUES (1, 'зеленый', 1);
INSERT INTO answer (question_id, variant, value) VALUES (1, 'белый', 0);
INSERT INTO answer (question_id, variant, value) VALUES (1, 'красный', 0);

--должен вернуть 0
SELECT * FROM public.check_question(1, 'белый');
--должен вернуть 1
SELECT * FROM public.check_question(1, 'зеленый');


----------------------------------------------------

--второй вариант(есди первый не сработал)

--проверка работы функции
INSERT INTO question (title) VALUES ('Какого цвета динозавр');
INSERT INTO answer (question_id, variant, value) VALUES (3, 'зеленый', 1);
INSERT INTO answer (question_id, variant, value) VALUES (3, 'белый', 0);
INSERT INTO answer (question_id, variant, value) VALUES (3, 'красный', 0);

--должен вернуть 0
SELECT * FROM public.check_question(3, 'белый');
--должен вернуть 1
SELECT * FROM public.check_question(3, 'зеленый');