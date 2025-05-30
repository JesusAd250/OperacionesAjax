
# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Instala las dependencias
RUN npm install

# Copia el resto de los archivos de la aplicación
COPY . .

# Expone el puerto en el que la app se ejecutará
EXPOSE 3000

# Comando por defecto para ejecutar la aplicación
CMD ["npm", "start"]
