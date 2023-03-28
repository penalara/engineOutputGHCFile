# AnonymousClassRoom Schema

```txt
https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/timetable/properties/anonymousClassRooms/items
```

Object with anonymous classrooms created in a set of classrooms.

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                       |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghcEngineOutput.schema.json\*](../../../out/ghcEngineOutput.schema.json "open original schema") |

## items Type

`object` ([AnonymousClassRoom](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md))

# items Properties

| Property                                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                                                                                                                     |
| :-------------------------------------- | :------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refClassRoomsSet](#refclassroomsset)   | `string` | Required | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-refclassroomsset.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/timetable/properties/anonymousClassRooms/items/properties/refClassRoomsSet")      |
| [classRoomsCreated](#classroomscreated) | `array`  | Required | cannot be null | [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/timetable/properties/anonymousClassRooms/items/properties/classRoomsCreated") |

## refClassRoomsSet

Identifier of the ClassRooms group.

`refClassRoomsSet`

*   is required

*   Type: `string`

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-refclassroomsset.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/timetable/properties/anonymousClassRooms/items/properties/refClassRoomsSet")

### refClassRoomsSet Type

`string`

## classRoomsCreated

List of anonymous classroom created in one set of classrooms.

`classRoomsCreated`

*   is required

*   Type: `string[]` ([AnonymousRoom](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms-anonymousroom.md))

*   cannot be null

*   defined in: [EngineOutputGHCSchema](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms.md "https://github.com/penalara/jsonGhcSchemas/blob/main/schemas/common/ghcEngineOutput.schema.json#/properties/timetable/properties/anonymousClassRooms/items/properties/classRoomsCreated")

### classRoomsCreated Type

`string[]` ([AnonymousRoom](ghcengineoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom-properties-listofanonymousrooms-anonymousroom.md))
