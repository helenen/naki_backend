
INSERT INTO lesson (ID, NAME, LESSON_ORDER)
VALUES(01, 'Grammaire de base', 01),
(02,'Grammaire essentielle', 02),
(03,'Sujet avancés', 03);

INSERT INTO exercice (ID, QUESTION_ASSET_ITEM, GOOD_QUESTION_ITEM, ANSWER_QUESTION_ITEM, EXERCICE_ORDER )
VALUES(01, 'Forme déclarative', 'これだ','', 01);

INSERT INTO cours (ID, NAME, lesson_id, exercice_id)
VALUES(01,'Expression de l’état-d’être', (SELECT ID from lesson WHERE LESSON_ORDER=01),(SELECT ID from exercice WHERE EXERCICE_ORDER=01) ),
(02, 'Introduction aux particules （は、も、が)', (SELECT ID  from lesson WHERE LESSON_ORDER=01), (SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(03,'Adjectifs', (SELECT ID  from lesson WHERE LESSON_ORDER=01 ) ,(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(04,'Notions de base sur les verbes', (SELECT ID  from lesson WHERE LESSON_ORDER=01) ,(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(05,'Forme négative des verbes', (SELECT ID  from lesson WHERE LESSON_ORDER=02),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(06,'Forme polie et radicaux des verbes （～です、～ます)', (SELECT ID  from lesson WHERE LESSON_ORDER=02),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(07,'Marque de questionnement （か)', (SELECT ID  from lesson WHERE LESSON_ORDER=02),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(08,'Phrases composées （forme en ～て、から、ので、のに、が、けど、し、～たりする)', (SELECT ID from lesson WHERE LESSON_ORDER=02),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(09,'Autres utilisations de la forme en ～て （～ている、～てある、～ておく、～ていく、～てくる)', (SELECT ID  from lesson WHERE LESSON_ORDER=02),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(10,'Conditionnel （と、なら、ば、たら)', (SELECT ID  from lesson WHERE LESSON_ORDER=02),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(11,'Tendances （～がち、～つつ、きらいがある)', (SELECT ID  from lesson WHERE LESSON_ORDER=03),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(12,'Montrer les signes de quelque chose （～がる、ばかり、～めく)', (SELECT ID  from lesson WHERE LESSON_ORDER=03),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(13,'Choses qui devraient être d’une certaine manière （はず、べき、べく、べからず)', (SELECT ID from lesson WHERE LESSON_ORDER=03),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(14,'Exprimer différents niveaux de certitude （かもしれない、でしょう、だろう)', (SELECT ID  from lesson WHERE LESSON_ORDER=03),(SELECT ID from exercice WHERE EXERCICE_ORDER=01)),
(15,'Proximité avancée des actions （が早いか、や否や、そばから)', (SELECT ID  from lesson WHERE LESSON_ORDER=03),(SELECT ID from exercice WHERE EXERCICE_ORDER=01));

INSERT INTO level (ID, NAME, cours_id)
VALUES(01, 'Debutant',(SELECT ID from cours where name= 'Expression de l’état-d’être') ),
(02, 'Intermediaire',(SELECT ID from cours where name= 'Expression de l’état-d’être')),
(03, 'Avancé',(SELECT ID from cours where name= 'Forme négative des verbes'));

INSERT INTO asset (ID, ASSET_ORDER, TYPE, VALUE)
VALUES(01, 01, 'image', 01);

INSERT INTO theme (ID, NAME, DESCRIPTION, cours_id )
VALUES(01, 'Particules de base', 'Introduction aux particules de base', (SELECT ID from cours where name= 'Marque de questionnement （か)'));