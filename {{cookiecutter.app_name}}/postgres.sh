docker run -d --name {{cookiecutter.slug}}-db -e POSTGRES_PASSWORD={{cookiecutter.db_pass}} -v {{cookiecutter.db_data_dir}}:/var/lib/postgresql/data -p 5432:5432 postgres
