INSERT INTO level (ID, NAME)
VALUES(01, 'debutant'),
(02, 'intermediaire'),
(03, 'avancé');

INSERT INTO cours (Id, NAME)
VALUES(01, 'Grammaire de base'),
(02, 'Grammaire essentielle'),
(03, 'Sujet avancés');

INSERT INTO lesson (ID, NAME, LESSON_ORDER)
VALUES(01, 'Expression de l’état-d’être', 01),
(02,'Introduction aux particules （は、も、が', 02),
(03,'Adjectifs', 03),
(04,'Notions de base sur les verbes',04),
(05,'Forme négative des verbes', 05),
(06,'Forme polie et radicaux des verbes （～です、～ます', 06),
(07,'Marque de questionnement （か', 07),
(08,'Phrases composées （forme en ～て、から、ので、のに、が、けど、し、～たりする', 08),
(09,'Autres utilisations de la forme en ～て （～ている、～てある、～ておく、～ていく、～てくる', 09),
(10,'Conditionnel （と、なら、ば、たら', 10),
(11,'Tendances （～がち、～つつ、きらいがある', 11),
(12,'Montrer les signes de quelque chose （～がる、ばかり、～めく', 12),
(13,'Choses qui devraient être d’une certaine manière （はず、べき、べく、べからず', 13),
(14,'Exprimer différents niveaux de certitude （かもしれない、でしょう、だろう', 14),
(15,'Proximité avancée des actions （が早いか、や否や、そばから', 15);

INSERT INTO exercice (ID, QUESTION_ASSET_ITEM, GOOD_QUESTION_ITEM, ANSWER_QUESTION_ITEM, EXERCICE_ORDER )
VALUES(01, 'ある', 'aru', 'iejfeidj', 01);

INSERT INTO asset (ID, ASSET_ORDER, TYPE, VALUE)
VALUES(01, 01, 'image', 01);

INSERT INTO theme (ID, NAME, DESCRIPTION )
VALUES(01, 'Particules de base', 'Introduction aux particules de base');