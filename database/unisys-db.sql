PGDMP         6                x         	   unisys-db    12.3    12.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16393 	   unisys-db    DATABASE     �   CREATE DATABASE "unisys-db" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE "unisys-db";
                postgres    false            �            1259    16405    hibernate_sequence    SEQUENCE     {   CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public          postgres    false            �            1259    16420    tb_jobs    TABLE     �   CREATE TABLE public.tb_jobs (
    id integer NOT NULL,
    active boolean NOT NULL,
    name character varying(255),
    tasks bytea
);
    DROP TABLE public.tb_jobs;
       public         heap    postgres    false            �            1259    16428    tb_tasks    TABLE     �   CREATE TABLE public.tb_tasks (
    id integer NOT NULL,
    completed boolean NOT NULL,
    created_at timestamp without time zone,
    name character varying(255),
    weight double precision NOT NULL
);
    DROP TABLE public.tb_tasks;
       public         heap    postgres    false                      0    16420    tb_jobs 
   TABLE DATA           :   COPY public.tb_jobs (id, active, name, tasks) FROM stdin;
    public          postgres    false    203   �                 0    16428    tb_tasks 
   TABLE DATA           K   COPY public.tb_tasks (id, completed, created_at, name, weight) FROM stdin;
    public          postgres    false    204   T                  0    0    hibernate_sequence    SEQUENCE SET     @   SELECT pg_catalog.setval('public.hibernate_sequence', 8, true);
          public          postgres    false    202            �
           2606    16427    tb_jobs tb_jobs_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.tb_jobs
    ADD CONSTRAINT tb_jobs_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.tb_jobs DROP CONSTRAINT tb_jobs_pkey;
       public            postgres    false    203            �
           2606    16432    tb_tasks tb_tasks_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.tb_tasks
    ADD CONSTRAINT tb_tasks_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.tb_tasks DROP CONSTRAINT tb_tasks_pkey;
       public            postgres    false    204               R   x�3�,�,IML�H-���2rS�K��<c�(�"gƙ�[��_��
��y�E�`�PinjrFb^frbH$F��� "��         g   x�u�K
�0 �ur
/���Z�,nD-A�����n�Y>LL9��9#��:$�!���S�>�qߦ�j,SE�������H��o?�,Q5�����Q-�"���,�     