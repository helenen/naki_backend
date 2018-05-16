INSERT INTO level (ID, NAME)
VALUES(01, 'Debutant'),
(02, 'Intermediaire'),
(03, 'Avancé');

INSERT INTO cours (Id, NAME)
VALUES(01,'Expression de l’état-d’être'),
(02, 'Introduction aux particules （は、も、が)'),
(03,'Adjectifs' ),
(04,'Notions de base sur les verbes'),
(05,'Forme négative des verbes'),
(06,'Forme polie et radicaux des verbes （～です、～ます)'),
(07,'Marque de questionnement （か)'),
(08,'Phrases composées （forme en ～て、から、ので、のに、が、けど、し、～たりする)'),
(09,'Autres utilisations de la forme en ～て （～ている、～てある、～ておく、～ていく、～てくる)'),
(10,'Conditionnel （と、なら、ば、たら)'),
(11,'Tendances （～がち、～つつ、きらいがある)'),
(12,'Montrer les signes de quelque chose （～がる、ばかり、～めく)'),
(13,'Choses qui devraient être d’une certaine manière （はず、べき、べく、べからず)'),
(14,'Exprimer différents niveaux de certitude （かもしれない、でしょう、だろう)'),
(15,'Proximité avancée des actions （が早いか、や否や、そばから)');

INSERT INTO lesson (ID, NAME, LESSON_ORDER)
VALUES(01, 'Grammaire de base', 01),
(02,'Grammaire essentielle', 02),
(03,'Sujet avancés', 03);

INSERT INTO exercice (ID, QUESTION_ASSET_ITEM, GOOD_QUESTION_ITEM, ANSWER_QUESTION_ITEM, EXERCICE_ORDER )
VALUES(01, 'Forme déclarative', 'これだ','', 01);

INSERT INTO asset (ID, ASSET_ORDER, TYPE, VALUE)
VALUES(01, 01, 'image', 01);

INSERT INTO theme (ID, NAME, DESCRIPTION )
VALUES(01, 'Particules de base', 'Introduction aux particules de base');