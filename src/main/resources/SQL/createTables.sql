CREATE TABLE IF NOT EXISTS public.student(
	student_id SERIAL PRIMARY KEY,
	email text NOT NULL,
	password character varying(16) NOT NULL,
	last_name character varying(20) NOT NULL,
    first_name character varying(20) NOT NULL,
    role character varying(20)
);

CREATE TABLE IF NOT EXISTS public.teacher
(
    teacher_id  SERIAL PRIMARY KEY,
	email text NOT NULL,
	password character varying(16) NOT NULL,
    last_name character varying(20) NOT NULL,
    first_name character varying(20) NOT NULL,
    company character varying,
    position character varying,
    role character varying(20)
);

CREATE TABLE IF NOT EXISTS public.course(
	course_id SERIAL PRIMARY KEY,
	title character varying,
	description text,
	hours integer,
	image character varying,
	teacher_id integer,
	is_available boolean,
	date_of_publishing date,
     FOREIGN KEY (teacher_id) REFERENCES public.teacher (teacher_id)
);


CREATE TABLE IF NOT EXISTS public.student_course(
    student_course_id SERIAL PRIMARY KEY,
	student_id integer,
	course_id integer,
FOREIGN KEY (student_id) REFERENCES public.student (student_id),
FOREIGN KEY (course_id) REFERENCES public.course (course_id)
);



CREATE TABLE IF NOT EXISTS public.lesson_test(
	lesson_test_id SERIAL PRIMARY KEY,
	title character varying
);


CREATE TABLE IF NOT EXISTS public.lesson(
	lesson_id SERIAL PRIMARY KEY,
	title character varying,
	content text,
	media text,
	lesson_test_id integer,
	course_id integer,

 FOREIGN KEY (lesson_test_id) REFERENCES public.lesson_test (lesson_test_id),
 FOREIGN KEY (course_id) REFERENCES public.course (course_id)
);


CREATE TABLE IF NOT EXISTS public.question(
	question_id SERIAL PRIMARY KEY,
	title text,
	lesson_test_id integer,
 FOREIGN KEY (lesson_test_id) REFERENCES public.lesson_test (lesson_test_id)

);


CREATE TABLE IF NOT EXISTS public.answer(
	answer_id SERIAL PRIMARY KEY,
	question_id integer,
	variant text,
	value integer,
FOREIGN KEY (question_id) REFERENCES public.question (question_id)
);



CREATE TABLE IF NOT EXISTS public.lesson_score(
                                lesson_score_id SERIAL PRIMARY KEY,
                                student_id integer,
                                lesson_id integer,
                                score integer,

                                FOREIGN KEY (student_id) REFERENCES public.student (student_id),
  								FOREIGN KEY ( lesson_id) REFERENCES public.lesson (lesson_id)
);


CREATE TABLE IF NOT EXISTS public.tag(
	tag_id SERIAL PRIMARY KEY,
	tag_name character varying,
	course_id integer,
	FOREIGN KEY (course_id) REFERENCES public.course (course_id)
);

