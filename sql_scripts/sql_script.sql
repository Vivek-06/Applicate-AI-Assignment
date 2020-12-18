DROP DATABASE  IF EXISTS `ApplicateAI-Assignment1`;
CREATE DATABASE  IF NOT EXISTS `ApplicateAI-Assignment1`;
USE `ApplicateAI-Assignment1`;

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `supplier` (name)
VALUES 
('SUPPLIER_A'),('SUPPLIER_B');

DROP TABLE IF EXISTS `catalog`;
CREATE TABLE `catalog` (
  `SKU_code` int(11) NOT NULL AUTO_INCREMENT,
  `SKU_name` varchar(100) NOT NULL,
  `SKU_description` char(200) NOT NULL,
  `Brand_name` varchar(100) NOT NULL,
  `Brand_description` varchar(200) NOT NULL,
  `Supplier_id` int(11) not null,
  PRIMARY KEY (`SKU_code`, `Supplier_id`),
  KEY `FK_SUPPLIER_idx` (`supplier_id`),
  CONSTRAINT `FK_SUPPLIER` FOREIGN KEY (`supplier_id`) 
  REFERENCES `supplier` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
  
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



INSERT INTO `catalog` (SKU_name,SKU_description,Brand_name,Brand_description,Supplier_id)
VALUES 
('Haldiram Namkeen', 'Haldiram Namkeen are tangy and deep-fried savoury cookies made from wheat flour flavored with ginger, lemon, salt, black pepper, red chilli powder and clove.',
	'Haldiram', 'Haldiram is a widely known manufacturer of Indian sweets and snacks specializing in high quality, ready-to-eat snacks, savories and sweets.',1),
('Bingo 200gm', 'It contains 200gm snacks which price is Rs 5.00', 'Bingo', 'Evening snack time will be fun with the Bingo Salted Potato Chips. Made from golden quality potatoes, these chips are crispy and yummy.',1),
('Bingo 500gm', 'It contains 500gm snacks which price is Rs 10.00', 'Bingo', 'Evening snack time will be fun with the Bingo Salted Potato Chips. Made from golden quality potatoes, these chips are crispy and yummy.',1),
('AASHIRVAAD Atta', 'AASHIRVAAD Atta with Multigrains gives you the wholesome goodness of six different grains – wheat, soya, channa, oat, maize and psyllium husk.', 'AASHIRVAAD',
'Aashirvaad is a brand of staple food and kitchen ingredients owned by ITC Ltd',2),
('Samrat Atta', 'Samrat atta by Parakh group is a whole wheat atta, which is much more than just a wheat atta product', 'Samrat',
'Samrat India - Leading flour manufacturers in India by Parakh Group. Its main objective is to produce premium quality flour Products such as Wheat Flour',2);



