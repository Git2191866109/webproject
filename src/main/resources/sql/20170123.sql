create table weibo.posts(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    date DATE not null,
    author_name VARCHAR(20) not null,
    likes SMALLINT,
    content TEXT, PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table weibo.comments(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    c_date DATE not null,
    c_author_name VARCHAR(20) not null,
    c_content TEXT,
    post_id INT not null,PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table weibo.users(
     `id` int(11) NOT NULL AUTO_INCREMENT,
     name VARCHAR(20) not null,
     password VARCHAR(20) not null,
     PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;