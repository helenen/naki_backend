INSERT INTO category (NAME)
VALUES('lesson'),
('exercice'),
('adjectif-ni'),
('adjectif-na'),
('verbe'),
('nombre'),
('dialogue'),
('son'),
('image'),
('nom'),
('mois'),
('jour du mois');

INSERT INTO level (NAME)
VALUES('Debutant'),
('Intermediaire'),
('Avancé');


INSERT INTO lesson (NAME, level_id)
VALUES('Introduction aux particules （は、も、が)', 1),
('La forme pour exprimer le potentiel', 2),
('Exprimer différents niveaux de certitude', 3),
('Notions de base sur les verbes', 1),
('Utiliser する et なる avec la particule に （～[のよう]になる／する）',2),
('lesson3',3);

INSERT INTO chapter (TITLE,lesson_id)
VALUES('Définir les fonctions grammaticales avec les particules',1),
('La particule de thème 「は',1),
('Exprimer la capacité de faire quelque chose',2),
('La forme potentielle',2),
('Les formes potentielles n''ont pas d objet',2),
('Est-ce que 「見える」 et 「聞こえる」 sont des exceptions?',2),
('Exprimer différents degrés de certitude',3),
('Exprimer 「かもしれない」 pour exprimer l’incertitude',3),
('Utiliser 「でしょう」 pour exprimer une faible certitude (poli)',3),
('Le rôle des verbes', 4 ),
('Classer les verbes en -ru et en -u', 4),
('Appendice des verbes en –u ("iru"/"eru")', 4),
('Utiliser 「する」 et 「なる」 avec la particule 「に」', 5),
('Utiliser 「なる」 and 「する」 pour les noms et les adjectifs-na', 5),
('Utiliser 「なる」 avec les adjectifs-i', 5),
('Utiliser 「なる」 et 「する」 avec les verbes',5);

INSERT INTO text(TEXT, EXEMPLE, chapter_id)
VALUES('Nous allons maintenant faire bon usage de ce que nous venons d apprendre en associant un nom à un autre nom.
Ceci peut être réalisé à l aide de ce que l on appelle des particules.
Les particules, formées de un ou deux caractères hiragana, s ajoutent à la fin d un mot pour définir quelle fonction grammaticale il remplit dans la phrase.
Employer les bonnes particules est très important car la signification d une phrase peut en être radicalement changé.
Par exemple, la phrase "manger du poisson." peut devenir "le poisson mange." simplement en changeant une particule.', null,1),
('La première particule que nous apprendrons est la particule de thème.
La particule de thème permet de montrer de quoi vous êtes en train de parler ou plus simplement, le thème de la phrase. Par exemple, une personne nous dit : "pas étudiant."
Bien que nous n ayons pas beaucoup d informations supplémentaires sur cette phrase à cause du manque de connaissance de son contexte, cette phrase sera parfaitement correcte en japonais.
Cette particule nous permet donc d exprimer de quoi notre phrase va parler. La particule de thème utilise le caractère 「は」, mais bien que ce caractère soit normalement prononcé / ha /, il est uniquement prononcé / wa / lorsqu il est employé comme particule de thème.',
'ボブ：　アリスは学生？- Alice, es-tu étudiante?
アリス：　うん、学生。- Ouais, je le suis.', 2),
('Dans cet exemple, Bob indique que sa question concerne Alice. On remarquera que malgré le fait que 「だ」 nait pas été employé, la traduction française utilise tout de même le verbe être : es et suis.
De plus, comme nous savons que le thème de la question est Alice, nous navons besoin de rien dautre pour deviner quAlice est une étudiante.
En fait, puisque Bob pose une question, il ne peut pas ajouter 「だ」 car dans ce cas, il affirmerait une chose tout en posant une question dessus.','ボブ：　ジムは明日？- Est Jim demain ?
アリス：　ジムは明日じゃない。- Jim pas demain.', 2),
('Puisque nous navons aucun contexte, il ny a pas assez dinformations pour donner un sens convenable à cette conversation.
Il est certain quaffirmer que Jim soit en réalité demain na aucun sens.
Dans un contexte donné, aussi longtemps quil existe un lien entre Jim et demain, la phrase peut signifier nimporte quoi.
Ils pourraient ainsi parler de la date dun examen.','アリス）　今日は試験だ。- Aujourdhui est examen.
ボブ）　ジムは？ - Et concernant Jim?
アリス）　ジムは明日。 - Jim est demain. (Pour Jim, lexamen est demain.)',2 ),
('Il est important de noter à quel point un sujet peut ne pas être spécifié.
Il peut se référer à nimporte quel objet ou action qui se trouve nimporte où dans la phrase énoncée, y compris celles qui ont déjà été dites.
Par exemple, dans la dernière phrase de la conversation ci-dessus, il nest nulle part fait mention du mot "examen" alors quil est question de lexamen de Jim !', null, 2),
('En général, les Japonais n’affirment pas quelque chose tant qu’ils ne sont pas absolument surs que c’est correct.
C’est ce qui est pris en compte pour l’usage incroyablement fréquent de 「～と思う」 et des diverses expressions grammaticales utilisées pour exprimer des niveaux spécifiques de certitude.
Nous allons voir ces expressions en partant du plus bas degré de certitude au plus haut.',null, 7),
('「かもしれない」 est utilisé pour dire "peut-être" ou "possiblement" et est moins certains que le mot 「多分」.
Il s’attache à la fin d’une proposition complète. Pour les noms et les adjectifs -na, le「だ」déclaratif doit être enlevé.
Il peut aussi être écrit en kanji comme 「かも知れない」 et vous pouvez le traiter de la même façon qu’un verbe en –u négatif (il n’y a pas d’équivalent positif) dès lors la forme en –masu deviendrait 「かもしれません」.
Dans le discourt informel, il peut être raccourci en 「かも」.
Il y a aussi une version très masculine 「かもしれん」, qui est simplement un différent type de verbe négatif vu ici.','（１）　スミスさんは食堂に行ったかもしれません。 - Il se pourrait que Smith san soit allé à la cafétéria.
（２）　雨で試合は中止になるかもしれないね。 - Il se pourrait que le jeu soit annulé pour la pluie, hein?
（３）　この映画は一回見たことあるかも！- Il se pourrait que j’aie déjà vu ce film une foi.
（４）　あそこが代々木公園かもしれない。- Par là il se pourrait que se soit Yoyogi Park.
（５）　もう逃げられないかもしれんぞ。- Il est probable que je ne puisse déjà plus m’échapper, tu sais.',8),
('「でしょう」 est utilisé pour exprimer un peut de certitude et est proche en signification 「多分」.
Tout comme 「～です／～ます」, il doit venir à la fin d’une phrase complète. Il n’a pas d’autre conjugaison.
 Vous pouvez aussi remplacer 「～ですか」 avec 「～でしょうか」 pour rendre la question légèrement plus polie et moins directe en ajoutant un léger niveau d’incertitude.','（１）　明日も雨でしょう。- Demain aussi il pleut (peut-être).
（２）　あなたは、学生さんでしょうか。- Seriez-vous l‘étudiant?
（３）　これからどこへ行くんでしょうか？- Par où iriez vous d’ici?', 9),
('En japonais, la capacité de faire une certaine action sexprime en conjuguant le verbe plutôt quen ajoutant un mot tel que les mots «peut» ou «capable de» dans le cas de langlais.
 Tous les verbes conjugués à la forme potentielle deviennent un verbe en ru.',null , 3),
('Encore une fois, les règles de conjugaison peuvent être divisées en trois groupes principaux: verbes-ru, verbes-u et verbes dexception.
Cependant, la forme potentielle du verbe 「す る meaning (signifiant« faire ») est une exception particulière car elle devient un verbe complètement différent:「 で き る 」(出来 る)', '
Règles de création de forme potentielle
Pour les verbes ru: Remplacez le 「る」 par 「ら れ る」.
Exemple: る る → 見 ら れ る
Pour les verbes u: Modifiez le dernier caractère dun son / u / voyelle en son équivalent / e / voyelle et ajoutez 「る」.
Exemple: ぶ ぶ → 遊 べ → 遊 べ る
Des exceptions:
」す る」 devient 「で き る」
」く る」 devient 「こ ら れ る」
※ Rappelez-vous que tous les verbes potentiels deviennent des verbes-ru.',4),
('La forme potentielle indique que quelque chose est possible mais aucune action réelle nest réellement prise.
 Bien que la forme potentielle soit toujours un verbe, car elle décrit l’état de faisabilité, en général, vous ne voulez pas utiliser l’objet direct 「を」 comme vous le feriez avec la forme non potentielle du verbe.
 Par exemple, les phrases suivantes ne semblent pas naturelles.','富士山を登れた。
重い荷物を持てます。', 5),
('Il y a deux verbes 「見 え る」 et 「聞 こ え る mean qui signifient que quelque chose est visible et audible, respectivement.
Lorsque vous voulez dire que vous pouvez voir ou entendre quelque chose, vous voudrez utiliser ces verbes.
Si, toutefois, vous vouliez dire que vous avez eu loccasion de voir ou dentendre quelque chose, vous utiliseriez la forme potentielle habituelle.
Cependant, dans ce cas, il est plus courant dutiliser le type dexpression comme dans lexemple 3.','る は 晴 れ て, 富士山 が 見 え る.
(Il) sest éclairci aujourdhui et Fuji-san est visible.
た 達 の お か げ で, 映 画 は た だ で 見 ら れ.
Grâce à (mon) ami, (I) a pu regarder le film gratuitement.
た 達 の お か げ で, 映 画 を た だ で 見 た で.
Grâce à (mon) ami, (I) a pu regarder le film gratuitement.',6),
('Nous avons à ce jour appris comment décrire des noms de diverses manières avec dautres noms et adjectifs.
Ceci nous donne une certaine puissance expressive. Cependant, nous ne pouvons pas encore exprimer dactions.
Cest là que les verbes interviennent. Les verbes, en japonais, viennent toujours à la fin des propositions.
Mais puisque nous navons pas encore appris comment créer plus dune proposition, il faudra que nimporte quelle phrase avec un verbe finisse avec ce verbe.
Nous allons maintenant apprendre les deux catégories principales des verbes, qui nous permettront de définir de manière précise des règles de conjugaison.
Avant de commencer, il y a une chose importante à garder à lesprit.',null,10 ),
('Nous pouvons utiliser les verbes 「する」 et 「なる」 en conjonction avec la particule 「に」 pour différentes expressions très utiles.
 Nous sommes habitués à utiliser la particule objet avec 「する」 puisque quelque chose est en général fait à quelque chose d''autre.
 Nous verrons comment évolue la signification lorsque la particule est remplacée par 「に」.
 Par contre, pour 「なる」, on utilise toujours la particule 「に」 car "devenir" n''est pas une action faite à quelque chose mais plutôt le but d''une transformation.
  Le seul point de grammaire intéressant ici est d''utiliser 「なる」 avec les adjectifs-i et les verbes.',null, 13 ),
('Comme expliqué précédemment, utiliser 「なる」 avec des noms et des adjectifs-na ne présente rien de neuf et agit exactement de la manière dont vous l''attendez.','（１）　彼の日本語が上手になった。- Il est devenu habile en japonais.
（２）　私は医者になった。- Je suis devenu médecin.
（３）　私は有名な人になる。- Je deviendrais une célébrité.', 13),
('Pour les adjectifs, utilcd cd iser le verbe 「する」 avec la particule 「に」 est juste une révision de la leçon sur les adverbes. Cependant, pour les noms, lorsque vous utilisez le verbe 「する」 avec la particule 「に」, cela signifie que vous allez faire quelque chose pour tendre vers quelque chose. Cela change la signification de 「する」 qui veut maintenant dire "se décider pour [X]", "Choisir [X]".
C''est une expression commune, entre autre, lorsque vous passez une commande sur le menu d''un restaurant.','（１）　私は、ハンバーガーとサラダにします。
- Je prendrais l''hamburger et une salade. (lit: Je vais me décider pour l''hamburger et une salade.)
（２）　他にいいものがたくさんあるけど、やっぱりこれにする。
- Il y a beaucoup d''autres choses qui sont bonnes, mais, comme je le pensais, je vais me décider pour celle-ci.',13 ),
('Si vous pensez que cette expression est étrange, pensez un peu à l''expression anglaise : "I''ll go with the hamburger.
" Où diable partez-vous avec cet hamburger ?',null, 13),
('Comme la particule 「に」 est une particule de but utilisée pour les noms, et par extension pour les adjectifs-na, nous devons utiliser autre chose pour montrer que quelque chose devient un adjectif-i.
Comme "devenir" exprime un changment d''état, cela paraît logique de décrire ce processus en utilisant un adverbe.
En fait, vous remarquerez que nous utilisons déjà un (une sorte de) adverbe de la section précédente en utilisant 「に」 avec les adjectifs-na.','（１）　去年から背が高くなったね。
- Tu as grandi depuis l''an dernier, hein ?
（２）　運動しているから、強くなる。
- Je deviendrais plus fort car je m''exerce.
（３）　勉強をたくさんしたから、頭がよくなった。
- Comme j''ai beaucoup étudié, je suis devenu plus intelligent. (lit : tête est devenue mieux)',14 );



INSERT INTO exercise (QUESTION_ASSET_ITEM, GOOD_QUESTION_ITEM, ANSWER_QUESTION_ITEM1, ANSWER_QUESTION_ITEM2, ANSWER_QUESTION_ITEM3, EXERCISE_ORDER, chapter_id)
VALUES('学校_どこ？', 'は','それ','も','が', 1, 3),
('これ_何？','は','も','どれ','が', 2, 4),
('ここ_図書館だ', 'が','どれ','も','は', 3, 5),
('学校はどこ？','あそこで','こちらで','銀行の横です','美日間の横です',4,1),
('これは何？','かぎ','ドア','くつ','コンピュータ',5,1);



INSERT INTO vocabulary(NAME, ROMAJI,  exercise_id)
VALUES('家','ie', 1);

INSERT INTO number(NAME,ROMAJI, exercise_id)
VALUES('一つ','hitotsu', 1),
('二つ','hitotsu', 2);



INSERT INTO theme (NAME, DESCRIPTION)
VALUES('Vocabulaire', 'vocabulaire'),
('Grammaire', 'Grammaire'),
('Dialogue', 'Dialogue');

INSERT INTO asset (type, value, transcription, asset_order, exercise_id)
VALUES('sound','https://res.cloudinary.com/helenen/video/upload/v1536407552/%E3%81%82%E3%81%AE%E3%81%AF%E3%81%8A%E3%81%8A%E3%81%8D%E3%81%84%E3%83%A9%E3%82%A4%E3%82%AA%E3%83%B3%E3%81%A6%E3%82%99%E3%81%99.mp3',null, 1, 1),
('image', 'https://res.cloudinary.com/helenen/image/upload/v1535461637/Lion_d_Afrique.jpg','あのはおおきいライオンです。', 2,1),
('sound', 'https://res.cloudinary.com/helenen/video/upload/v1536418352/%E5%AD%A6%E6%A0%A1%E3%81%AF%E3%81%A8%E3%82%99%E3%81%93.mp3',null,3,4),
('image','https://res.cloudinary.com/helenen/image/upload/v1536420030/une-ecole-intercommunale-realisee-en-un-an-par-des-entreprises-locales-et-des-maitres-d-oeuvre-et-d-ouvrage-competents-1447789284-150x150.jpg','学校はどこ？',4,4),
('sound','https://res.cloudinary.com/helenen/video/upload/v1536436452/%E3%81%93%E3%82%8C%E3%81%AF%E4%BD%95.mp3',null,5,5),
('image','https://res.cloudinary.com/helenen/image/upload/v1536436461/sarl-ou-sas.jpg','これは何？',5,5);

