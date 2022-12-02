FROM ubuntu:22.04
RUN apt update
RUN apt install openjdk-11-jdk -y
RUN apt install nginx -y
EXPOSE 80
CMD ["service", "start", "nginx"]
