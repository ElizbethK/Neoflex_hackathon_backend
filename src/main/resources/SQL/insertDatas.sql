INSERT INTO lesson_test (title) VALUES ('Java Test');

INSERT INTO question (question_id, title, lesson_test_id) VALUES (1, '<p>In Java, which of the following methods is used for grouping objects and storing the results in a <strong>Ma<\/strong><strong>p<\/strong><em>&nbsp;<\/em>instance?<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (1, 'Collectors.groupingBy()', 1);
INSERT INTO answer (question_id, variant, value) VALUES (1, 'Collectors.groupBy()', 0);
INSERT INTO answer (question_id, variant, value) VALUES (1, 'Collectors.partitioningBy()', 0);
INSERT INTO answer (question_id, variant, value) VALUES (1, 'Collectors.partitionBy()', 0);

INSERT INTO student (student_id, email, password, last_name, first_name) VALUES (1, 'ivanovivan@libre.ru','Qwerty12', 'Иванов', 'Иван');

INSERT INTO teacher (teacher_id, email, password, last_name, first_name, company, position) VALUES (1, 'grigova@mail.ru','Asdfg123', 'Васильев', 'Григорий','TrainBrain','teacher');

INSERT INTO course (course_id, title, description, hours, image, teacher_id, is_available, date_of_publishing) VALUES (1, 'DevOps Essentials','Этот курс предназначен для тех, кто хочет научиться DevOps и обрести необходимые навыки для автоматизации процессов разработки и доставки ПО. В рамках курса вы научитесь работать с инструментами для автоматизации и управления конфигурацией, контейнеризации и оркестрации приложений, а также настроите непрерывную интеграцию и доставку ПО', 2, 'https://w10.naukri.com/mailers/2022/naukri-learning/what-is/What-is-Frontend-Development.jpg',1, true, '2022-03-04');

INSERT INTO student_course (student_course_id, student_id, course_id) VALUES (1, 1, 1);

INSERT INTO lesson (lesson_id, title, content, media, lesson_test_id, course_id) VALUES (1, 'Введение в Docker','В этом уроке вы узнаете, что такое Docker и как его использовать в DevOps-проектах. Мы рассмотрим, как создавать и запускать Docker-контейнеры, а также как управлять ими с помощью Docker CLI. Вы также узнаете о контейнеризации приложений и о том, как Docker помогает упростить процесс развертывания и управления приложениями в производственной среде.
', 'https://www.youtube.com/watch?v=pGYAg7TMmp0', 1, 1);

INSERT INTO lesson_score (lesson_score_id, student_id, lesson_id, score) VALUES (1, 1, 1, 1);

INSERT INTO tag (tag_id, tag_name, course_id) VALUES (1, 'dev', 1);

--добавление 2 урока в курс 1
INSERT INTO lesson (lesson_id, title, content, media, lesson_test_id, course_id) VALUES (2, 'Frontend Development Fundamentals','В этом уроке вы узнаете, что такое HTML и CSS, как они используются для создания веб-страниц, и как их можно использовать для разработки фронтенда. Мы рассмотрим базовые теги HTML и стили CSS, а также покажем, как использовать их для создания различных элементов веб-страницы. Вы также узнаете о базовых принципах разметки веб-страниц и о том, какие инструменты и средства разработки доступны для разработки фронтенда.', 'https://www.youtube.com/watch?v=UB1O30fR-EE', 2, 1);


--добавление всего по 2 кругу(новый учитель, новый ученик, новый курс и тд.
INSERT INTO lesson_test (lesson_test_id, title) VALUES (2, 'Frontend Development Fundamentals Test');
INSERT INTO lesson_test (lesson_test_id, title) VALUES (3, 'Data Analysis with Python Test');
INSERT INTO lesson (lesson_id, title, content, media, lesson_test_id, course_id) VALUES (2, 'Frontend Development Fundamentals','В этом уроке вы узнаете, что такое HTML и CSS, как они используются для создания веб-страниц, и как их можно использовать для разработки фронтенда. Мы рассмотрим базовые теги HTML и стили CSS, а также покажем, как использовать их для создания различных элементов веб-страницы. Вы также узнаете о базовых принципах разметки веб-страниц и о том, какие инструменты и средства разработки доступны для разработки фронтенда.', 'https://www.youtube.com/watch?v=UB1O30fR-EE', 2, 1);

INSERT INTO student (student_id, email, password, last_name, first_name) VALUES (2, 'romanova@mail.ru','indbuiep125', 'Романова', 'Ольга');

INSERT INTO teacher (teacher_id, email, password, last_name, first_name, company, position) VALUES (2, 'uheoko@mail.ru','Gbhri12', 'Григорьев', 'Виктор','TrainBrain','teacher');

INSERT INTO course (course_id, title, description, hours, image, teacher_id, is_available, date_of_publishing) VALUES (2, 'Data Analysis with Python','Курс "Data Analysis with Python" предназначен для тех, кто хочет научиться анализировать данные с помощью языка программирования Python. В рамках курса вы изучите необходимые инструменты и библиотеки Python для работы с данными, научитесь проводить анализ данных и визуализацию результатов, а также научитесь строить модели машинного обучения для прогнозирования будущих событий на основе данных.', 2, 'https://onlanta.ru/upload/grain.tables/fca/4og95ml6t7v0834izgecsfz2al8rcjvo/032621devops-1620x1080.jpg', 2, true, '2023-01-22');

INSERT INTO student_course (student_course_id, student_id, course_id) VALUES (2, 2, 2);

INSERT INTO lesson (lesson_id, title, content, media, lesson_test_id, course_id) VALUES (1, 'Работа с данными в Python: Pandas','В этом уроке вы узнаете, как работать с данными в Python с помощью библиотеки Pandas. Вы научитесь читать и записывать данные из различных форматов файлов, таких как CSV, Excel, SQL, а также производить базовую очистку данных, выборку данных и их агрегацию. Вы также узнаете о различных типах данных и методах их обработки в Pandas.', 'https://www.youtube.com/watch?v=vmEHCJofslg', 3, 2);

INSERT INTO lesson_score (lesson_score_id, student_id, lesson_id, score) VALUES (2, 2, 1, 3);

INSERT INTO tag (tag_id, tag_name, course_id) VALUES (2, 'data', 2);


--проверка
SELECT * FROM public.lesson_test;
SELECT * FROM public.answer;
SELECT * FROM public.question;
SELECT * FROM public.student;
SELECT * FROM public.teacher;
SELECT * FROM public.course;
SELECT * FROM public.student_course;
SELECT * FROM public.lesson;
SELECT * FROM public.lesson_score;
SELECT * FROM public.tag;



--проверка
SELECT * FROM public.lesson_test;
SELECT * FROM public.answer;
SELECT * FROM public.question;
SELECT * FROM public.student;
SELECT * FROM public.teacher;
SELECT * FROM public.course;
SELECT * FROM public.student_course;
SELECT * FROM public.lesson;
SELECT * FROM public.lesson_score;
SELECT * FROM public.tag;


--удаление данных
DELETE FROM tag;
DELETE FROM student_course;
DELETE FROM course;
DELETE FROM lesson_score;
DELETE FROM student;
DELETE FROM lesson;
DELETE FROM teacher;


