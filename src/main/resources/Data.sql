
INSERT INTO asset (ID, ASSET_ORDER, TYPE, VALUE)
VALUES(1, 1, 'image', 1);




INSERT INTO theme (ID, NAME, DESCRIPTION)
VALUES(1, 'Vocabulaire', 'vocabulaire'),
(2, 'Grammaire', 'Grammaire'),
(3, 'Dialogue', 'Dialogue');

INSERT INTO exercise (ID, QUESTION_ASSET_ITEM, GOOD_QUESTION_ITEM, ANSWER_QUESTION_ITEM, EXERCISE_ORDER)
VALUES(1, 'Forme déclarative', 'これだ','', 1),
(2, 'Forme déclarative', 'これだ','', 2),
(3, 'Forme déclarative', 'これだ','', 3),
(4, 'Forme déclarative', 'これだ','', 4),
(5, 'Forme déclarative', 'これだ','', 5),
(6, 'Forme déclarative', 'これだ','', 6),
(7, 'Forme déclarative', 'これだ','', 7),
(8, 'Forme déclarative', 'これだ','', 8),
(9, 'Forme déclarative', 'これだ','', 9),
(10,'Forme déclarative', 'これだ','', 10),
(11,'Forme déclarative', 'これだ','', 11),
(12,'Forme déclarative', 'これだ','', 12),
(13,'Forme déclarative', 'これだ','', 13),
(14,'Forme déclarative', 'これだ','', 14),
(15,'Forme déclarative', 'これだ','', 15);

INSERT INTO cours (ID, NAME, exercise_id)
VALUES(1,'Expression de l’état-d’être',1),
(2, 'Introduction aux particules （は、も、が)',2),
(3,'Adjectifs',3),
(4,'Notions de base sur les verbes',4),
(5,'Forme négative des verbes',5),
(6,'Forme polie et radicaux des verbes （～です、～ます)',6),
(7,'Marque de questionnement （か)',7),
(8,'Phrases composées （forme en ～て、から、ので、のに、が、けど、し、～たりする)',8),
(9,'Autres utilisations de la forme en ～て （～ている、～てある、～ておく、～ていく、～てくる)',9),
(10,'Conditionnel （と、なら、ば、たら)',10),
(11,'Tendances （～がち、～つつ、きらいがある)',11),
(12,'Montrer les signes de quelque chose （～がる、ばかり、～めく)',12),
(13,'Choses qui devraient être d’une certaine manière （はず、べき、べく、べからず)',13),
(14,'Exprimer différents niveaux de certitude （かもしれない、でしょう、だろう)',14),
(15,'Proximité avancée des actions （が早いか、や否や、そばから)',15);



INSERT INTO subTheme (ID, NAME, DESCRIPTION, TYPE, cours_id, exercise_id)
VALUES(1, 'Leçons', 'leçon de grammaire', 'lesson',1,null),
(2, 'exercices', 'exercice de grammaire', 'exercice',null , 1),
(3, 'adjectifs', 'adjectif', 'adjectif-ni',3,null),
(4, 'adjectifs', 'adjectif', 'adjectif-na',3,null),
(5, 'verbes', 'verbes', 'verbe',4,null),
(6, 'nombres', 'nombre', 'lesson',null,null),
(7, 'dialogue', 'kaiwa', 'dialogue',null,null);

INSERT INTO level (ID, NAME)
VALUES(1, 'Debutant'),
(2, 'Intermediaire'),
(3, 'Avancé');



