DEVST_AWAJI_ANIMALS
====================

全チームのコミットをマージしてやろうと思いたった。

リモート追加
------------
::

  git remote add monkey   git://github.com/devst/devst_awaji_src  
  git remote add turtle   git://github.com/devst/devst_awaji_turtle  
  git remote add rabbit   git://github.com/devst/devst_awaji_rabbit  
  git remote add giraffe  git://github.com/devst/devst_awaji_giraffe 
  git remote add elephant git://github.com/devst/devst_awaji_elephant
  git remote add penguin  git://github.com/devst/devst_awaji_penguin
  git remote add tiger    git://github.com/devst/devst_awaji_tiger
  git remote add sheep    git://github.com/devst/devst_awaji_sheep
  git remote add dog      git://github.com/devst/devst_awaji_dog
  git remote add mouse    git://github.com/devst/devst_awaji_mouse
  git remote add cow      git://github.com/devst/devst_awaji_cow
  git remote add snake    git://github.com/devst/devst_awaji_snake
  git remote add horse    git://github.com/devst/devst_awaji_horse
  git remote add bird     git://github.com/devst/devst_awaji_bird
  git remote add wildboar git://github.com/devst/devst_awaji_wildboar

全部fetch
---------
::

  git fetch --all

merge
-----
::

  git merge xxxx/master

  git checkout --ours .gitignore
  git checkout --ours README.rst
  git checkout --ours pom.xml
  mvn test

